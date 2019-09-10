export class AlunoModel {
  constructor(
    public id: number,
    public cpf: string,
    public nome: string,
    public email: string,
    public phone: string,
    public bornDate: string,
    public createdAt: string,
    // public adress = {
    //   name: '',
    //   number: '',
    //   complement: '',
    //   cep: '',
    //   city: '',
    //   state: ''
    // },
    // public active: boolean = true,
    // public contactName: string,
    // public contactPhone: string

  ) {}
}
