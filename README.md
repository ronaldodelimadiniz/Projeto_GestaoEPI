# Gestão EPI

Aplicativo Android desenvolvido para facilitar o controle e a gestão de Equipamentos de Proteção Individual (EPIs), com foco em organização, agilidade e segurança no acompanhamento das rotinas do sistema.

## Sobre o projeto

O **Gestão EPI** é um aplicativo criado para centralizar funcionalidades importantes relacionadas ao controle de EPIs, como cadastro de funcionários, gerenciamento de equipamentos, entregas, relatórios e configurações do sistema.

A aplicação foi desenvolvida em **Android Studio**, utilizando **Java**, **XML**, **ConstraintLayout** e componentes da **Material Design**.

## Funcionalidades

### Tela de Login
- Acesso inicial da aplicação.
- Validação simples de usuário e senha.
- Redirecionamento para o menu principal após login correto.

### Menu Principal
- Interface inicial após o login.
- Acesso rápido às principais áreas do sistema.
- Organização visual em cards para facilitar a navegação.

### Módulo de Funcionários
- Área destinada ao cadastro e gestão de funcionários.
- Estrutura preparada para futuras funcionalidades de consulta, edição e exclusão.

### Módulo de EPIs
- Controle dos equipamentos cadastrados no sistema.
- Preparado para organizar os EPIs por tipo, quantidade e situação.

### Módulo de Entregas
- Registro de entregas de EPIs aos funcionários.
- Apoio ao controle de quem recebeu, o que recebeu e quando recebeu.

### Módulo de Relatórios
- Espaço para visualização de dados e informações resumidas.
- Futuramente pode incluir gráficos, filtros e exportação de dados.

### Módulo de Configurações
- Área para ajustes gerais do aplicativo.
- Pode ser expandida para preferências do usuário e parâmetros do sistema.

### Logout
- Permite sair da sessão atual com segurança.

## Tecnologias utilizadas

- **Java**
- **XML**
- **Android Studio**
- **ConstraintLayout**
- **Material Components**
- **ImageView / TextView / MaterialButton / TextInputLayout**
- **Drawables personalizados**

## Estrutura básica do projeto

```text
app/
├── java/com/example/gestaoepi/
│   ├── LoginActivity.java
│   ├── MenuActivity.java
│   ├── SplashActivity.java
│   └── outras activities
├── res/
│   ├── layout/
│   │   ├── login_layout.xml
│   │   └── menu_layout.xml
│   ├── drawable/
│   │   ├── epi.png
│   │   ├── entrega.png
│   │   └── outros ícones
│   ├── values/
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   └── themes.xml
