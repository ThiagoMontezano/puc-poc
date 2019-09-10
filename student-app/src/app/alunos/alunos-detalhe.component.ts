import { AlunoService } from './alunos.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';

import { AlunoModel } from './aluno.model';

@Component({
    selector: 'app-alunos-detalhe',
    templateUrl: 'alunos-detalhe.component.html'
})
export class AlunosDetalheComponent implements OnInit {

    contato: AlunoModel;
    private isNew: boolean = true;

    constructor(
        private contatoService: AlunoService,
        private route: ActivatedRoute,
        private location: Location
    ) {}

    ngOnInit(): void {
        this.contato = new AlunoModel(0, '', '', '', '', '', '');

        this.route.params.forEach((params: Params) => {
            let id: number = +params['id'];

            if (id) {

                this.isNew = false;

                this.contatoService.find(id)
                    .then((contato: AlunoModel) => {
                        this.contato = contato;
                    });
            }

        });
    }

    getFormGroupClass(isValid: boolean, isPristine: boolean): {} {
        return {
            'form-group': true,
            'has-danger': !isValid && !isPristine,
            'has-success': isValid && !isPristine
        };
    }

    getFormControlClass(isValid: boolean, isPristine: boolean): {} {
        return {
            'form-control': true,
            'form-control-danger': !isValid && !isPristine,
            'form-control-success': isValid && !isPristine
        };
    }

    onSubmit(): void {
        let promise: Promise<AlunoModel>;

        if (this.isNew) {
            console.log('cadastrar contato');
            promise = this.contatoService.create(this.contato);
        } else {
            console.log('alterar contato');
            promise = this.contatoService.update(this.contato);
        }

        promise.then(contato => this.goBack());
    }

    goBack(): void {
        this.location.back();
    }

}
