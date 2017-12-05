package ddd_project.model.domain;

import static ddd_project.util.UtilValidacao.valida;
import java.util.Collections;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa extends Entidade {
    
    @ManyToMany
    private Set<Pessoa> relacoes;
    

    /**
     * JPA/Hibernate backdoor
     */
    public Pessoa(){}
    
    public Pessoa(
            Set<Pessoa> relacoes) {
        validacoes(relacoes);
    }

     public Pessoa(
            Set<Pessoa> relacoes,
            long id) {
        super(id);
        validacoes(relacoes);
    }
    
    private void validacoes(Set<Pessoa> relacoes) {
        this.relacoes = valida(relacoes, () -> {
            throw new ExcecaoNegocio(
                    10,
                    "Pessoa relacoes", 
                    "Relacoes nula ou inválida.");
        });
    }

    public Set<Pessoa> getRelacoes() {
        return Collections.unmodifiableSet(relacoes);
    }

}
