package com.rsm.megasena.service;

import com.rsm.megasena.domain.Dado;
import com.rsm.megasena.domain.MegaSena;
import com.rsm.megasena.domain.Numero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DadosService {

    public List<Dado> getDados(List<MegaSena> megaSenas) {
        List<Dado> dados = criarListaDeDados();

        megaSenas.forEach(megaSena -> dados.forEach(dado -> {
            if (megaSena.getNumeros().contains(dado.getNumero().getValor())) {
                dado.somaQuantidade();
            }
        }));

        return dados;
    }

    private List<Dado> criarListaDeDados() {
        List<Dado> dados = new ArrayList<>();
        dados.add(new Dado(Numero.UM));
        dados.add(new Dado(Numero.DOIS));
        dados.add(new Dado(Numero.TRES));
        dados.add(new Dado(Numero.QUATRO));
        dados.add(new Dado(Numero.CINCO));
        dados.add(new Dado(Numero.SEIS));
        dados.add(new Dado(Numero.SETE));
        dados.add(new Dado(Numero.OITO));
        dados.add(new Dado(Numero.NOVE));
        dados.add(new Dado(Numero.DEZ));
        dados.add(new Dado(Numero.ONZE));
        dados.add(new Dado(Numero.DOZE));
        dados.add(new Dado(Numero.TREZE));
        dados.add(new Dado(Numero.QUATORZE));
        dados.add(new Dado(Numero.QUINZE));
        dados.add(new Dado(Numero.DEZESSEIS));
        dados.add(new Dado(Numero.DEZESSETE));
        dados.add(new Dado(Numero.DEZOITO));
        dados.add(new Dado(Numero.DEZENOVE));
        dados.add(new Dado(Numero.VINTE));
        dados.add(new Dado(Numero.VINTEEUM));
        dados.add(new Dado(Numero.VINTEEDOIS));
        dados.add(new Dado(Numero.VINTEETRES));
        dados.add(new Dado(Numero.VINTEEQUATRO));
        dados.add(new Dado(Numero.VINTEECINCO));
        dados.add(new Dado(Numero.VINTEESEIS));
        dados.add(new Dado(Numero.VINTEESETE));
        dados.add(new Dado(Numero.VINTEEOITO));
        dados.add(new Dado(Numero.VINTEENOVE));
        dados.add(new Dado(Numero.TRINTA));
        dados.add(new Dado(Numero.TRINTAEUM));
        dados.add(new Dado(Numero.TRINTAEDOIS));
        dados.add(new Dado(Numero.TRINTAETRES));
        dados.add(new Dado(Numero.TRINTAEQUATRO));
        dados.add(new Dado(Numero.TRINTAECINCO));
        dados.add(new Dado(Numero.TRINTAESEIS));
        dados.add(new Dado(Numero.TRINTAESETE));
        dados.add(new Dado(Numero.TRINTAEOITO));
        dados.add(new Dado(Numero.TRINTAENOVE));
        dados.add(new Dado(Numero.QUARENTA));
        dados.add(new Dado(Numero.QUARENTAEUM));
        dados.add(new Dado(Numero.QUARENTAEDOIS));
        dados.add(new Dado(Numero.QUARENTAETRES));
        dados.add(new Dado(Numero.QUARENTAEQUATRO));
        dados.add(new Dado(Numero.QUARENTAECINCO));
        dados.add(new Dado(Numero.QUARENTAESEIS));
        dados.add(new Dado(Numero.QUARENTAESETE));
        dados.add(new Dado(Numero.QUARENTAEOITO));
        dados.add(new Dado(Numero.QUARENTAENOVE));
        dados.add(new Dado(Numero.CINQUENTA));
        dados.add(new Dado(Numero.CINQUENTAEUM));
        dados.add(new Dado(Numero.CINQUENTAEDOIS));
        dados.add(new Dado(Numero.CINQUENTAETRES));
        dados.add(new Dado(Numero.CINQUENTAEQUATRO));
        dados.add(new Dado(Numero.CINQUENTAECINCO));
        dados.add(new Dado(Numero.CINQUENTAESEIS));
        dados.add(new Dado(Numero.CINQUENTAESETE));
        dados.add(new Dado(Numero.CINQUENTAEOITO));
        dados.add(new Dado(Numero.CINQUENTAENOVE));
        dados.add(new Dado(Numero.SESSENTA));

        return dados;
    }
}
