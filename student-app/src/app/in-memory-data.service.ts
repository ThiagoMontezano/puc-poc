import { AlunoModel } from './alunos/aluno.model';
import { InMemoryDbService } from 'angular-in-memory-web-api';


export class InMemoryDataService implements InMemoryDbService {

    createDb(): {} {

        const ContatoMock: AlunoModel[] = [
            { id: 1, cpf: '111.222.333-11', nome: 'João das Neves', email: 'a@a.com.br',
            phone: '11-90123-4567', bornDate: '27/07/1994', createdAt: '22-01-09'
            // adress: {
            //   name: 'Rua A',
            //   number: '476',
            //   complement: 'Casa',
            //   cep: '31565-341',
            //   city: 'São Paulo',
            //   state: 'SP'
            // }, active: false, contactName: 'João das Neves', contactPhone: '11-90123-4567'
          },
          { id: 2, cpf: '333.333.333-33', nome: 'Maria da Silva', email: 'baaaa@asssx.com.br',
            phone: '11-98765-4433', bornDate: '18/01/1988', createdAt: '22-01-09'
            // adress: {
            //   name: 'Rua B',
            //   number: '123',
            //   complement: 'Casa',
            //   cep: '01509-871',
            //   city: 'São Paulo',
            //   state: 'SP'
            // }, active: false, contactName: 'Maria da Silva', contactPhone: '11-98765-4433'
          },
          { id: 3, cpf: '077.123.876-22', nome: 'Thiago Montezano', email: 'thiago@montezano.com.br',
            phone: '11-98765-0000', bornDate: '27/07/1994', createdAt: '22-01-09'
            // adress: {
            //   name: 'Rua C',
            //   number: '54432',
            //   complement: 'Casa',
            //   cep: '16472-090',
            //   city: 'São Paulo',
            //   state: 'SP'
            // }, active: false, contactName: 'Thiago Montezano', contactPhone: '11-98765-0000'
          },
          { id: 4, cpf: '444.444.4444-56', nome: 'Aluno Novo', email: 'aluno@a.com.br',
            phone: '11-98888-1111', bornDate: '01/08/2000', createdAt: '22-01-09'
            // adress: {
            //   name: 'Rua D',
            //   number: '123',
            //   complement: 'Casa',
            //   cep: '01598-090',
            //   city: 'São Paulo',
            //   state: 'SP'
            // }, active: false, contactName: 'Aluno Novo', contactPhone: '11-98888-1111'
          },
          ];

        return {
            'contatos': ContatoMock,
        };

    }

}
