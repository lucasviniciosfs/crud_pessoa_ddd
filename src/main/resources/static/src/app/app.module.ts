import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { HomeComponent } from './view/home/home.component';
import { PessoaComponent } from './view/pessoa/pessoa.component';

import { PessoaContainerComponent } from './controller/container/pessoa-container/pessoa-container.component';
import { PessoaService } from './controller/service/pessoa.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PessoaComponent,
    PessoaContainerComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [PessoaService],
  bootstrap: [AppComponent],
})
export class AppModule { }
