import { AlunosDetalheComponent } from './alunos-detalhe.component';
import { AlunosListaComponent } from './alunos-lista.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const alunoRoutes: Routes = [
    {
        path: 'alunos',
        component: AlunosListaComponent
    },
    {
        path: 'aluno/save',
        component: AlunosDetalheComponent
    },
    {
        path: 'aluno/save/:id',
        component: AlunosDetalheComponent
    }
];

@NgModule({
    imports: [
        RouterModule.forChild(alunoRoutes)
    ],
    exports: [RouterModule]
})
export class AlunoRoutingModule {}
