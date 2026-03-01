<h1>Exercício de Fixação: Classes e Métodos Abstratos</h1>

<h2>📝 Resumo</h2>
<p>Um sistema simples de linha de comando criado para treinar o conceito de Abstração na Programação Orientada a Objetos. O objetivo é instanciar diferentes figuras geométricas (Círculo e Retângulo) e calcular suas áreas com base em um contrato rigoroso estabelecido pela classe mãe.</p>

<h2>🚩 Desafio Proposto</h2>
<p>Criar uma classe genérica de "Forma" que não pode ser instanciada diretamente, mas que obriga todas as suas classes filhas a implementarem sua própria fórmula matemática para o cálculo de área.</p>

<h3>🚀 Execução do Exercício</h3>

<details open>
  <summary><b>v1.0 - Aplicação Prática de Abstração</b></summary>
  <ul>
    <li><b>Classes Abstratas (<code>abstract</code>):</b> Blindagem da classe <code>Shape</code>, garantindo que o sistema a trate apenas como um conceito/molde, impedindo a criação de uma forma genérica.</li>
    <li><b>Métodos Abstratos:</b> Criação do método <code>area()</code> sem corpo na classe mãe, forçando o polimorfismo e obrigando as classes <code>Circle</code> e <code>Rectangle</code> a assinarem o contrato de cálculo matemático usando o <code>@Override</code>.</li>
    <li><b>Enums Avançados:</b> Implementação do Enum <code>Color</code> armazenando códigos Hexadecimais. Utilização do método <code>.values()</code> para iteração dinâmica, eliminando menus engessados (<i>hardcoded</i>).</li>
    <li><b>Separação de Camadas:</b> Manutenção das boas práticas dividindo o projeto em <code>entities</code>, <code>services</code>, <code>views</code> e <code>utilities</code>.</li>
  </ul>
  <p><b>Conceitos Praticados:</b> Classes Abstratas, Métodos Abstratos, Polimorfismo Obrigatório e Iteração Dinâmica de Enums.</p>
</details>

<hr>
<p><i>Este repositório é um laboratório prático focado estritamente no aprendizado da sintaxe e das regras de abstração do compilador Java.</i></p>