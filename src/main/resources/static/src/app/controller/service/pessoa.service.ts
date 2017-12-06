import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

import { Pessoa } from '../../model/pessoa';

@Injectable()
export class PessoaService {

  public static readonly ENDPOINT = '/api/pessoa';

  constructor(private http: HttpClient) { }

  create(pessoa: Pessoa): Observable<Pessoa> {
    return this.http.post<Pessoa>(PessoaService.ENDPOINT, pessoa);
  }

  readAll(): Observable<Array<Pessoa>> {
    return this.http.get<Array<Pessoa>>(PessoaService.ENDPOINT);
  }

  readById(id: number): Observable<Pessoa> {
    return this.http.get<Pessoa>(`${PessoaService.ENDPOINT}/${id}`);
  }

  update(pessoa: any, id: number): Observable<any> {
    return this.http.put(`${PessoaService.ENDPOINT}/${id}`, pessoa);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(`${PessoaService.ENDPOINT}/${id}`);
  }
}
