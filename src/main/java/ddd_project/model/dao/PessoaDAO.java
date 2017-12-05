package ddd_project.model.dao;

import ddd_project.model.domain.Pessoa;

public class PessoaDAO extends DAO<Pessoa, Long> {
    
    public PessoaDAO(ProvedorTransacao transacao, Class<Pessoa> clazzP) {
        super(transacao, clazzP);
    }
    
}
