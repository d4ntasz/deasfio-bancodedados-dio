import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	  public Set<String> listarClientes() {
        if (contas == null) return new HashSet<>();
        return contas.stream()
            .map(conta -> conta.cliente.getNome())
            .collect(Collectors.toSet());
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
