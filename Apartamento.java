/**
 * Classe que representa um Apartamento.
 *
 * <p>Esta classe contém informações básicas sobre um apartamento,
 * como seu andar, número e proprietário.</p>
 */

public class Apartamento {
    // Propriedades usadas
    private int andar;
    private int numero;
    private String proprietario;

    /**
     * Construtor para inicializar um novo Apartamento.
     *
     * @param andar O andar do apartamento.
     * @param numero O número do apartamento.
     * @param proprietario O nome do proprietário do apartamento.
     */
    public Apartamento(int andar, int numero, String proprietario) {
        this.andar = andar;
        this.numero = numero;
        this.proprietario = proprietario;
    }

    /**
     * Consulta os dados do apartamento.
     *
     * @return Uma string contendo os dados do apartamento.
     */
    public String consultarDados() {
        return "Andar: " + andar + ", Número: " + numero + ", Proprietário: " + proprietario;
    }

    /**
     * Edita o proprietário do apartamento.
     *
     * @param novoProprietario O nome do novo proprietário.
     */
    public void editarProprietario(String novoProprietario) {
        this.proprietario = novoProprietario;
    }
}
