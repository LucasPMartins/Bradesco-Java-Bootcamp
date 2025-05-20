# RESUMO LAB 03

### **1. O que é IA Generativa?**

IA generativa é um tipo de inteligência artificial capaz de **criar novos conteúdos**, como textos, imagens, códigos, músicas e muito mais.
Ela é diferente da IA tradicional, que apenas analisa ou classifica dados. A IA generativa **gera algo novo** a partir de exemplos anteriores, usando **modelos de linguagem grandes (LLMs)**.

---

### **2. Exemplos do que a IA Generativa pode criar**

* **Textos** (resumos, artigos, conversas).
* **Imagens** (ex: com o modelo DALL-E).
* **Códigos de programação**.
* **Respostas em linguagem natural em apps de chat e assistentes virtuais.**

---

### **3. Como ela funciona: Modelos de Linguagem Grandes (LLMs)**

Esses modelos são treinados com grandes volumes de texto e funcionam com base em três passos:

* **Tokenização:** transforma as palavras em números (tokens).
* **Inserções:** cria vetores que representam o significado das palavras.
* **Atenção:** identifica quais palavras se relacionam mais entre si para prever a sequência de texto mais coerente.

A arquitetura usada é chamada **transformer**, com dois blocos principais:

* **Codificador** (entende o contexto).
* **Decodificador** (gera o novo conteúdo).

---

### **4. Copilotos**

**Copilotos** são assistentes baseados em IA generativa integrados a outros aplicativos, como:

* **Microsoft Edge**, **Bing**, **GitHub Copilot**, entre outros.

Eles ajudam usuários a realizar tarefas com base em linguagem natural, aumentando a produtividade e oferecendo respostas inteligentes ou automações.

---

### **5. Engenharia de Prompt**

É o processo de **melhorar os resultados** da IA gerativa por meio de **prompts bem elaborados**.

Técnicas incluem:

* Usar linguagem clara e direta.
* Adicionar exemplos no prompt.
* Dar instruções específicas de comportamento (mensagens do sistema).
* Fornecer dados de apoio (como trechos de texto ou contexto).

---

### **6. OpenAI no Azure**

O **Azure OpenAI Service** oferece acesso aos principais modelos generativos da OpenAI, como:

* **GPT-4**
* **GPT-3.5**
* **Embeddings** (para similaridade de texto)
* **DALL-E** (para geração de imagens)

Você pode usar esses modelos:

* Pelo **Azure OpenAI Studio** (ambiente visual).
* Por **API**, **SDKs** ou **CLI**.

O serviço também oferece:

* **Ferramentas de segurança e responsabilidade**, como filtros de conteúdo e controles de acesso.
* **Recursos empresariais**, como RBAC e redes privadas.

---

### **7. Aplicações práticas no Azure OpenAI**

* **Criação de conteúdo automático** (e-mails, artigos, resumos).
* **Geração de código** (incluindo testes automatizados).
* **Geração e edição de imagens** com base em descrições de texto.
* **Soluções empresariais com copilotos customizados**.

---

### **8. IA Generativa Responsável**

A Microsoft defende o uso responsável da IA com 4 etapas principais:

1. **Identificar** riscos.
2. **Medir** impactos.
3. **Mitigar** problemas.
4. **Operar** com responsabilidade contínua.


### **Explore Generative AI no Azure AI Foundry Portal**

Esse recurso permite que você **teste e interaja com modelos de IA generativa**, como o **GPT-4**, **GPT-3.5** e **DALL·E**, diretamente no ambiente visual do Azure, sem precisar escrever código. É ideal para quem quer explorar o poder da IA generativa de forma prática e rápida.

---

### **O que você pode fazer nessa área do portal**

1. **Testar modelos de linguagem (LLMs)**
   Você pode digitar prompts (comandos em linguagem natural) e ver como os modelos respondem, seja com textos, resumos, explicações ou sugestões.
   Exemplos:

   * Gerar ideias para conteúdo.
   * Criar respostas automáticas para e-mails.
   * Escrever trechos de código.
   * Resumir documentos longos.

2. **Gerar imagens com DALL·E**
   Basta descrever a imagem desejada (ex: “um gato astronauta caminhando na lua”) e o modelo cria imagens exclusivas com base no que foi pedido.

3. **Explorar funcionalidades com diferentes estilos de prompts**
   O ambiente é ideal para praticar **engenharia de prompts**, testando diferentes formas de formular pedidos para obter respostas mais úteis e direcionadas.

4. **Visualização amigável e sem código**
   Tudo funciona por meio de uma interface gráfica intuitiva, ideal tanto para iniciantes quanto para desenvolvedores que querem prototipar ideias rapidamente.

---

### **Vantagens de usar esse recurso**

* **Sem necessidade de configurar APIs ou infraestrutura.**
* **Acesso direto aos principais modelos OpenAI disponíveis no Azure.**
* **Ambiente seguro e controlado, com suporte a práticas de IA responsável.**
* **Integração com outras ferramentas do Azure para escalar depois.**

