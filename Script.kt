fun main() {
    val nome = "Juninho"
    val idade = 19
    exibirSaudacao(nome, idade)
}

// A função de exibição é uma expressão de bloco única
fun exibirSaudacao(nome: String, idade: Int) {
    println("Olá, Kotlin!")
    println("Nome: $nome")
    println("Idade: $idade")
}