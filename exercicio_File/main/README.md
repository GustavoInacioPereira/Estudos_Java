<h1>Exercício de Fixação: Manipulação de Arquivos (File I/O)</h1>

<h2>📝 Resumo </h2>
<p>Um sistema simples de linha de comando criado para treinar os conceitos avançados de Entrada e Saída (Input/Output) de dados em Java, focado na leitura, escrita e persistência segura de arquivos de texto.</p>

<h2>🚩 Desafio Proposto</h2>
<p>Criar um fluxo completo para capturar dados de clientes via terminal, persistir essas informações em um arquivo <code>.txt</code> local sem sobrescrever o histórico (modo append) e ler os registros de volta na tela, aplicando regras lógicas para garantir que não haja cadastros duplicados no banco de texto.</p>

<h3>🚀 Execução do Exercício</h3>

<details open>
  <summary><b>v1.0 - Leitura, Escrita e Segurança de I/O</b></summary>
  <ul>
    <li><b>Conexão com Disco (<code>java.io</code>):</b> Uso das classes <code>FileReader</code> e <code>FileWriter</code> para estabelecer a ponte de comunicação entre o Java e o Sistema Operacional.</li>
    <li><b>Bufferização de Dados:</b> Aplicação de <code>BufferedReader</code> e <code>BufferedWriter</code> para otimizar a performance, processando dados diretamente na memória RAM em vez de acessos lentos ao disco.</li>
    <li><b>Gerenciamento de Memória:</b> Implementação do bloco <code>try-with-resources</code> para garantir o fechamento autônomo das conexões (<code>.close()</code>), prevenindo vazamentos de recursos (<i>memory leaks</i>).</li>
    <li><b>Programação Defensiva:</b> Tratamento unificado de <code>IOException</code> e proteção rigorosa contra <code>NullPointerException</code> ao varrer arquivos vazios ou recém-criados.</li>
    <li><b>Prevenção de Conflitos:</b> Separação cronológica das etapas de validação e gravação para evitar <i>File Locks</i> (tentativa de ler e escrever no mesmo arquivo simultaneamente).</li>
  </ul>
  <p><b>Conceitos Praticados:</b> File I/O, Bufferização, Try-with-Resources, Prevenção de Exceções Nativas e Segurança de S.O.</p>
</details>

<hr>
<p><b>Conceitos Dominados no Exercício:</b> Persistência de Dados em Texto Plano, Gerenciamento Autônomo de Recursos (AutoCloseable), Lógica de Validação em Arquivos e Programação Defensiva em Fronteiras de Sistema.</p>