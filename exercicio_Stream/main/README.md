<h1>Processamento de Dados com Streams API</h1>

<h2>📝 Resumo </h2>
<p>Este projeto é a resolução de um exercício prático focado no paradigma funcional utilizando a <b>Stream API</b> e a manipulação de arquivos (I/O) em Java. O programa lê um arquivo de texto contendo dados de funcionários (nome, email, salário) e executa operações declarativas de filtragem, ordenação e redução matemática de forma altamente otimizada.</p>

<h2>🚩 Desafio Proposto</h2>
<p>Ler um arquivo estático de forma segura, extrair e exibir em ordem alfabética os e-mails dos funcionários que possuem salário superior a um valor específico, e em seguida, calcular a soma total dos salários de todos os funcionários cujo nome começa com a letra 'M'.</p>

<h3>🚀 Arquitetura e Funcionalidades do Sistema</h3>

<p>O projeto foi desenvolvido abandonando os tradicionais laços de repetição (<code>for/while</code>) em favor de esteiras de processamento de dados (Pipelines), focando no que deve ser feito, e não em como deve ser feito.</p>

<details open>
<summary><b>⚙️ Funcionalidades Implementadas</b></summary>
<ul>
<li><b>Leitura Segura (I/O):</b> Abertura e leitura do arquivo utilizando <code>Files.lines</code> em conjunto com <code>try-with-resources</code>, garantindo o fechamento automático da conexão com o disco rígido e prevenindo vazamento de memória.</li>
<li><b>Filtragem e Ordenação:</b> Extração cirúrgica dos e-mails através da inversão de ordem no Pipeline (Mapeamento antes da Ordenação), permitindo que a própria classe <code>String</code> do Java cuide da ordem alfabética automaticamente com o <code>.sorted()</code>.</li>
<li><b>Redução Matemática (Soma):</b> Cálculo da soma dos salários usando funções de agregação, sem a necessidade de criar variáveis de acúmulo externas.</li>
</ul>
</details>

<details open>
<summary><b>🛠️ Tecnologias e Conceitos Aplicados</b></summary>
<ul>
<li><b>Stream API (Java 8+):</b> Uso intensivo de operações intermediárias (<code>filter</code>, <code>map</code>, <code>sorted</code>) e operações terminais (<code>collect</code>, <code>sum</code>).</li>
<li><b>DoubleStream:</b> Transição de uma Stream de Objetos genérica para uma Stream Primitiva utilizando o <code>mapToDouble</code>, liberando acesso rápido à calculadora interna do Java para alta performance.</li>
<li><b>Sintaxe Moderna:</b> Uso de Expressões Lambda (<code>-></code>) e Method References (<code>Employee::getEmail</code>) para um Clean Code extremo.</li>
<li><b>Java NIO.2:</b> Abordagem moderna para manipulação de arquivos estáticos, substituindo o antigo FileReader/BufferedReader.</li>
</ul>
</details>

<hr>

<p><b>Conceitos Dominados:</b> Paradigma Funcional, Java 8+ Streams API, Manipulação de Arquivos (NIO.2), Try-With-Resources, Expressões Lambda, Method References, Pipeline de Dados e Funções de Agregação/Redução.</p>