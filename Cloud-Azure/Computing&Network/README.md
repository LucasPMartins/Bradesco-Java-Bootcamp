# **RESUMO LAB 5**

## **Computação na Azure**
Computação na Azure significa acessar recursos como processador, memória, disco e rede de forma **sob demanda**, sem precisar comprar e manter servidores físicos.

---

## **Tipos de Computação no Azure**

### **Máquinas Virtuais (VMs)** – (IaaS)

- São computadores virtuais completos que rodam na nuvem.
- Você pode escolher o sistema operacional, instalar aplicativos e configurar do seu jeito.
- Boa opção para quem quer migrar sistemas do ambiente local para a nuvem (lift-and-shift).

### **Conjuntos de Dimensionamento de VMs**

- Permitem **aumentar ou reduzir automaticamente** o número de VMs com base na demanda.
- Ideal para garantir performance sem gastar mais que o necessário.

### **Conjuntos de Disponibilidade de VMs**

- Aumentam a **resiliência** do ambiente, distribuindo as VMs em racks e datacenters diferentes.
- Ajudam a manter os serviços no ar mesmo com falhas físicas.

### **Área de Trabalho Virtual do Azure (Azure Virtual Desktop)**

- Cria um ambiente de **escritório completo na nuvem**, acessível de qualquer lugar.
- Vários usuários podem acessar a mesma VM ao mesmo tempo.
- Ideal para home office, empresas com filiais ou cenários educacionais.

---

## **Contêineres no Azure** – (PaaS)

### **Instâncias de Contêiner (ACI)**

- Executam aplicativos em contêineres **sem precisar gerenciar a infraestrutura**.
- Mais simples e rápidos que VMs para cargas menores.

### **Aplicativos de Contêiner do Azure**

- Além de rodar contêineres, permitem **balanceamento de carga e escalabilidade automática**.
- Úteis para aplicações modernas baseadas em microsserviços.

### **Serviço de Kubernetes do Azure (AKS)**

- Plataforma de orquestração para grandes volumes de contêineres.
- Ideal para sistemas complexos e distribuídos.

---

## **Azure Functions (Serverless)** – (PaaS)

- Permite executar **funções de código que rodam somente quando acionadas** (por eventos, APIs, etc.).
- Você **não paga por tempo ocioso**, só pelo tempo de execução.

---

## **Serviços de Aplicativo (App Services)** – (PaaS)

- Plataforma para criar e hospedar **aplicações web e APIs** rapidamente.
- Suporta linguagens como .NET, Java, Python, Node.js e mais.
- Totalmente gerenciado, com foco em desempenho, segurança e escalabilidade.

---

## **Serviços de Rede na Azure**

### **Rede Virtual do Azure (VNet)**

- É como uma “rede local” dentro da nuvem.
- Permite comunicação entre recursos na nuvem, internet e até com redes locais.

#### Pontos de Extremidade:

- **Públicos**: acessíveis da internet.
- **Privados**: acessíveis só de dentro da rede.

### **Sub-redes e Emparelhamento**

- Permitem **segmentar a rede** para segurança e organização.
- O **emparelhamento** conecta redes separadas como se fossem uma só.

---

## **Conectividade Segura**

### **Gateway de VPN**

- Cria uma conexão segura e criptografada entre a rede local e a Azure pela internet.

### **ExpressRoute**

- Conexão **privada e dedicada** com a Azure, sem passar pela internet.
- Oferece maior confiabilidade, segurança e velocidade.

---

## **DNS do Azure**

- Serviço para **gerenciar nomes de domínio (DNS)**, tanto para recursos internos quanto externos.
- Baseado em **alta disponibilidade**, com segurança integrada e fácil gerenciamento.
- Permite criar **nomes personalizados**, usar domínios privados e definir **registros de alias** apontando para recursos da Azure.

---

## **Passo a passo para configurar recursos e dimensionamento em Máquinas Virtuais (VMs) no Azure:**
[Para saber mais clique aqui](ConfigR&D.md)
