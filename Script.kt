fun main() {
    // 1. Definição dos dados
    val nome = "Juninho"
    val idade = 19

    // 2. Chamada da função para exibir os dados
    exibirInformacoes(nome, idade)
}

/**
 * Imprime uma saudação inicial e exibe o nome e a idade da pessoa.
 *
 * @param nome O nome da pessoa.
 * @param idade A idade da pessoa.
 */
fun exibirInformacoes(nome: String, idade: Int) {
    println("Olá, Kotlin!") // A saudação fica separada
    println("---")
    println("Nome: $nome")
    println("Idade: $idade")
}
