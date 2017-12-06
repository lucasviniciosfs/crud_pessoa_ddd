import { Component, OnInit } from '@angular/core';

import { PessoaService } from './../../service/pessoa.service';
import { Pessoa } from './../../../model/pessoa';

@Component({
  selector: 'app-pessoa-container',
  template: `<app-pessoa [pessoas]="pessoas"></app-pessoa>`
})
export class PessoaContainerComponent implements OnInit {

  pessoas: Array<Pessoa>;

  constructor(private pessoaService: PessoaService) { }

  ngOnInit() {
    this.pessoaService.readAll().subscribe(pessoas => {
      this.pessoas = pessoas;
    });
  }

}
