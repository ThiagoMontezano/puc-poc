import { AlunosListaComponent } from './alunos-lista.component';
import { AlunosDetalheComponent } from './alunos-detalhe.component';
import { AlunoService } from './alunos.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AlunoRoutingModule } from './alunos-routing.module';


@NgModule({
    imports: [
        CommonModule,
        AlunoRoutingModule,
        FormsModule
    ],
    declarations: [
        AlunosDetalheComponent,
        AlunosListaComponent
    ],
    exports: [
        AlunosListaComponent
    ],
    providers: [
        AlunoService
    ]
})
export class AlunosModule {}
