# RESUMO LAB 02

### **1. Inteligência de Documentos no Azure**

#### **Problema que resolve:**
Muitas empresas lidam com um grande volume de documentos (como faturas, recibos, formulários, etc.) e precisam extrair informações importantes de forma automática e eficiente.

#### **Funcionalidades principais**

- **Análise de documentos**: transforma arquivos (PDFs, imagens) em dados estruturados e compreensíveis.
- **Modelos pré-construídos**: prontos para reconhecer tipos comuns de documentos (faturas, recibos, identidades).
- **Modelos personalizados**: você pode treinar a IA com seus próprios documentos para extrair exatamente o que precisa.

#### **Exemplos de uso**

- Extração de dados de formulários digitalizados.
- Reconhecimento semântico (a IA entende o que cada campo representa, não só lê o texto).

#### **Document Intelligence Studio**

Ferramenta visual, sem necessidade de código, onde você pode:

- Criar recursos de IA.
- Testar modelos prontos ou treinar os seus próprios.
- Usar seus documentos reais para testar.

---

### **2. Mineração de Conhecimento com Azure Cognitive Search**

#### **Problema que resolve**

Muitas informações importantes estão “presas” em documentos, PDFs e anotações. A mineração de conhecimento ajuda a descobrir esses dados e transformá-los em algo útil e pesquisável.

#### **O que é**

É uma forma de aplicar IA para vasculhar grandes volumes de conteúdo e extrair insights.

#### **Plataforma usada**

- **Azure Cognitive Search**, que permite:

  - **Ingestão de dados** de várias fontes (como Azure Blob, Data Lake).
  - **Enriquecimento de conteúdo** com IA (visão computacional, processamento de linguagem, análise de sentimento).
  - **Criação de índices de pesquisa** para que o conteúdo fique fácil de encontrar.

#### **Conjuntos de habilidades (skills) da IA**

- Reconhecer entidades (nomes, locais, datas).
- Traduzir texto.
- Analisar sentimentos.
- Produzir documentos enriquecidos que são pesquisáveis e úteis para os usuários.

---

### **Destaque final**

O módulo enfatiza que a IA pode transformar conteúdo não estruturado (como PDFs e imagens) em informações pesquisáveis e acionáveis, tudo com a ajuda das ferramentas do Azure. É uma combinação de automação, inteligência e acesso fácil à informação.

---

### **Mineração de Conhecimento**

Mineração de conhecimento é o processo de descobrir informações relevantes em grandes volumes de dados que, muitas vezes, estão "escondidos" em documentos como PDFs, formulários, textos escaneados, imagens e notas manuscritas.
O objetivo é transformar esse conteúdo desorganizado em **informações úteis e estruturadas**, que ajudem empresas a tomar decisões, melhorar processos ou oferecer melhores serviços.

---

### **Pesquisa Cognitiva (Cognitive Search)**

A **Pesquisa Cognitiva** é uma tecnologia que permite fazer buscas inteligentes dentro de grandes quantidades de conteúdo textual.
Ela **vai além da busca por palavras-chave**, porque usa Inteligência Artificial para **entender o contexto**, **classificar**, **organizar** e **relacionar informações** automaticamente.

---

### **Solução de Pesquisa Cognitiva no Azure**

A Microsoft oferece a **Azure Cognitive Search**, uma plataforma completa para implementar mineração de conhecimento. Ela funciona em três etapas principais:

1. **Ingestão de dados:** importa informações de diversas fontes (como Azure Blob Storage, Data Lake ou tabelas).
2. **Enriquecimento de IA:** aplica inteligência para "entender" o conteúdo e torná-lo mais útil.
3. **Indexação e busca:** organiza os dados para que possam ser pesquisados facilmente por usuários ou aplicativos.

Você pode incorporar essa busca em aplicativos, criar dashboards ou permitir que usuários façam consultas em linguagem natural.

---

### **Enriquecimento de IA**

O **enriquecimento de IA** é o que transforma conteúdo bruto em informação inteligente e pesquisável. Ele funciona por meio de **conjuntos de habilidades (skills)** que analisam os dados e adicionam contexto.

Essas habilidades incluem:

- **Reconhecimento de entidades** (nomes, lugares, datas, valores).
- **Tradução de textos** para vários idiomas.
- **Análise de sentimentos** (positivo, negativo, neutro).
- **Extração de chaves e tópicos importantes**.

O resultado é um **documento enriquecido**, que passa por uma indexação inteligente e depois pode ser usado em mecanismos de busca ou relatórios personalizados.

---

