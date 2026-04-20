# Gestão EPI

Aplicativo Android desenvolvido para o controle e gerenciamento de Equipamentos de Proteção Individual (EPIs), com foco em organização, praticidade e agilidade no acesso às principais funções do sistema.

## Visão geral

O **Gestão EPI** foi criado para centralizar rotinas relacionadas ao controle de EPIs em um ambiente simples e funcional.  
O aplicativo conta com telas de login, menu principal e módulos separados para gerenciamento de funcionários, EPIs, entregas, relatórios, configurações e saída do sistema.

O projeto foi desenvolvido em **Android Studio**, utilizando **Java**, **XML**, **ConstraintLayout** e componentes da **Material Design**.

## Funcionalidades

### Login
- Tela inicial da aplicação.
- Validação simples de usuário e senha.
- Redirecionamento para o menu principal após autenticação.

### Menu principal
- Tela central de navegação.
- Acesso rápido às principais funcionalidades do sistema.
- Interface organizada em cards.

### Funcionários
- Área destinada ao cadastro e gerenciamento de funcionários.
- Estrutura preparada para futuras funcionalidades como edição, exclusão e consulta.

### EPIs
- Controle dos equipamentos de proteção cadastrados.
- Base para organização de tipos, quantidades e status dos itens.

### Entregas
- Registro de entrega de EPIs aos funcionários.
- Apoio no controle de datas, responsáveis e itens entregues.

### Relatórios
- Área reservada para visualização de dados e análises.
- Pode ser expandida para gráficos, filtros e exportação.

### Configurações
- Espaço para ajustes gerais do aplicativo.
- Estrutura para preferências e parâmetros do sistema.

### Logout
- Encerramento da sessão atual.
- Retorno à tela de login.

## Tecnologias utilizadas

- **Java**
- **XML**
- **Android Studio**
- **ConstraintLayout**
- **Material Components**
- **ImageView**
- **TextView**
- **MaterialButton**
- **TextInputLayout**
- **Image assets em drawable**

## Estrutura do projeto

```text
app/
├── manifests/
│   └── AndroidManifest.xml
├── java/com/example/gestaoepi/
│   ├── ConfiguracoesActivity.java
│   ├── DashboardActivity.java
│   ├── EntregasActivity.java
│   ├── EpisActivity.java
│   ├── FuncionariosActivity.java
│   ├── LoginActivity.java
│   ├── LogoutActivity.java
│   ├── MainActivity.java
│   ├── MenuActivity.java
│   ├── RelatoriosActivity.java
│   └── SplashActivity.java
├── res/
│   ├── drawable/
│   │   ├── entrega.png
│   │   ├── epi.png
│   │   ├── capacete_epi.xml
│   │   └── outros ícones
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── configuracoes_layout.xml
│   │   ├── dashboard_layout.xml
│   │   ├── entregas_layout.xml
│   │   ├── epis_layout.xml
│   │   ├── funcionarios_layout.xml
│   │   ├── login_layout.xml
│   │   ├── logout_layout.xml
│   │   ├── menu_layout.xml
│   │   ├── relatorios_layout.xml
│   │   └── splash_layout.xml
│   └── values/
│       ├── colors.xml
│       ├── strings.xml
│       └── themes.xml
