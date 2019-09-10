import { AlunoModel } from './aluno.model';
import { Component, OnInit } from '@angular/core';

import { DialogService } from './../dialog.service';
import { AlunoService } from './alunos.service';
@Component({
    selector: 'app-alunos-lista',
    templateUrl: 'alunos-lista.component.html'
})
export class AlunosListaComponent implements OnInit {

    contatos: AlunoModel[] = [];
    mensagem: {};
    classesCss: {};
    private currentTimeout: any;

    constructor(
        private alunoService: AlunoService,
        private dialogService: DialogService
    ) {}

    ngOnInit(): void {
        this.alunoService.findAll()
            .then((contatos: AlunoModel[]) => {
                this.contatos = contatos;
            }).catch(err => {
                console.log(err);
                this.mostrarMensagem({
                    tipo: 'danger',
                    texto: 'Ocorreu um erro ao buscar a lista de alunos!'
                });
            });
    }

    onDelete(contato: AlunoModel): void {
        this.dialogService.confirm('Deseja deletar o aluno ' + contato.nome + '?')
            .then((canDelete: boolean) => {

                if (canDelete) {

                    this.alunoService
                        .delete(contato)
                        .then(() => {

                            this.contatos = this.contatos.filter((c: AlunoModel) => c.id !== contato.id);

                            this.mostrarMensagem({
                                tipo: 'success',
                                texto: 'aluno deletado!'
                            });

                        }).catch(err => {
                            console.log(err);
                            this.mostrarMensagem({
                                tipo: 'danger',
                                texto: 'Ocorreu um erro ao deletar o aluno!'
                            });
                        });

                }

            });
    }

    private mostrarMensagem(mensagem: {tipo: string, texto: string}): void {
        this.mensagem = mensagem;
        this.montarClasses(mensagem.tipo);
        if (mensagem.tipo !== 'danger') {

            if (this.currentTimeout) {
                clearTimeout(this.currentTimeout);
            }

            this.currentTimeout = setTimeout(() => {
                this.mensagem = undefined;
            }, 3000);
        }
    }

    private montarClasses(tipo: string): void {
        this.classesCss = {
            'alert': true
        };
        this.classesCss['alert-' + tipo] = true; // alert-success
    }
}
