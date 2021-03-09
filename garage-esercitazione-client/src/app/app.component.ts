import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AutoDto } from './auto-dto';
import { Automobile } from './automobile';
import { CriterioRicercaDto } from './criterio-ricerca-dto';
import { ListaAutoDto } from './lista-auto-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  automobile = new Automobile();
  auto: Automobile[] = [];
  ricerca = "";


  constructor(private http: HttpClient) {
    this.aggiorna;
  }

  inserisci() {
    let dto = new AutoDto();
    dto.automobile = this.automobile;
    let oss = this.http.post<ListaAutoDto>("http://localhost:8080/inserisci-auto", dto);
    oss.subscribe(r =>
      this.auto = r.listaAuto)
    this.automobile = new Automobile();
    this.ricerca = "";
  }

  cancella(a: Automobile) {
    let dto = new AutoDto();
    dto.automobile = a;
    let oss = this.http.post<ListaAutoDto>("http://localhost:8080/rimuovi-auto", dto);
    oss.subscribe(r =>
      this.auto = r.listaAuto)
  }

  cerca() {
    let dto = new CriterioRicercaDto();
    dto.stringa = this.ricerca;
    let oss = this.http.post<ListaAutoDto>("http://localhost:8080/ricerca-auto", dto);
    oss.subscribe(r =>
      this.auto = r.listaAuto)
  }

  aggiorna() {
    let oss = this.http.get<ListaAutoDto>("http://localhost:8080/aggiorna");
    oss.subscribe(r =>
      this.auto = r.listaAuto)
  }

}
