import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Router } from '@angular/router/src/router';

import { HomeComponent } from './view/home/home.component';
import { PessoaComponent } from './view/pessoa/pessoa.component';

const routes: Routes = [
    {
        path: '',
        component: HomeComponent
    },
    {
        path: 'pessoas',
        component: PessoaComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
