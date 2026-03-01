<h1>Exercício de Fixação: Herança e Polimorfismo</h1>

<h2>📝 Resumo </h2>
<p>Um sistema simples de linha de comando criado para treinar os pilares da Programação Orientada a Objetos, focado na leitura de produtos e geração dinâmica de etiquetas de preço.</p>

<h2>🚩 Desafio Proposto</h2>
<p>Ler dados de N produtos (Comum, Usado e Importado) e mostrar a etiqueta de preço de cada um, aplicando taxas de alfândega ou datas de fabricação conforme o tipo, exigindo o uso prático de herança e polimorfismo para a solução.</p>

<h3>🚀 Execução do Exercício</h3>

<details open>
  <summary><b>v1.0 - Aplicação Prática de POO</b></summary>
  <ul>
    <li><b>Herança (<code>extends</code>):</b> Criação das classes <code>UsedProduct</code> e <code>ImportedProduct</code> herdando os atributos base da superclasse <code>Product</code>.</li>
    <li><b>Polimorfismo:</b> Uso de uma <code>List&lt;Product&gt;</code> genérica para armazenar e iterar sobre diferentes tipos de objetos na mesma estrutura.</li>
    <li><b>Sobreposição (<code>@Override</code>):</b> Sobrescrita do método <code>priceTag()</code> nas subclasses para que cada produto emita sua formatação específica.</li>
    <li><b>Encadeamento (<code>super</code>):</b> Uso do comando nos construtores para reaproveitar a inicialização de atributos (nome e preço) da classe matriz.</li>
    <li><b>Java Time API:</b> Utilização nativa do <code>LocalDate</code> e <code>DateTimeFormatter</code> para manipulação de datas de fabricação.</li>
  </ul>
  <p><b>Conceitos Praticados:</b> Herança, Polimorfismo, Override, Super e Manipulação de Datas.</p>
</details>

<hr>
<p><b>Conceitos Dominados no Exercício:</b> Lógica Orientada a Objetos, Relação "É-Um" (IS-A), Polimorfismo Dinâmico (Late Binding) e Reuso de Código.</p>