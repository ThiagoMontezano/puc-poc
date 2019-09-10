import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';

import { AlunoModel } from './aluno.model';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';

import { ServiceInterface } from '../interface/service.interface';

@Injectable()
export class AlunoService implements ServiceInterface<AlunoModel> {

    private contatosUrl = 'app/contatos';
    private headers: Headers = new Headers({'Content-Type': 'application/json'});

    constructor(
        private http: Http
    ) {}

    findAll(): Promise<AlunoModel[]> {
        return this.http.get(this.contatosUrl)
            .toPromise()
            .then(response => response.json().data as AlunoModel[])
            .catch(this.handleError);
    }

    find(id: number): Promise<AlunoModel> {
        return this.findAll()
            .then((contatos: AlunoModel[]) => contatos.find(contato => contato.id === id));
    }

    create(contato: AlunoModel): Promise<AlunoModel> {
        return this.http
            .post(this.contatosUrl, JSON.stringify(contato), {headers: this.headers})
            .toPromise()
            .then((response: Response) => response.json().data as AlunoModel)
            .catch(this.handleError);
    }

    update(contato: AlunoModel): Promise<AlunoModel> {
        const url = `${this.contatosUrl}/${contato.id}`; // app/contatos/:id
        return this.http
            .put(url, JSON.stringify(contato), {headers: this.headers})
            .toPromise()
            .then(() => contato as AlunoModel)
            .catch(this.handleError);
    }

    delete(contato: AlunoModel): Promise<AlunoModel> {
        const url = `${this.contatosUrl}/${contato.id}`; // app/contatos/:id
        return this.http
            .delete(url, {headers: this.headers})
            .toPromise()
            .then(() => contato as AlunoModel)
            .catch(this.handleError);
    }

    private handleError(err: any): Promise<any> {
        console.log('Error: ', err);
        return Promise.reject(err.message || err);
    }

}
