![thumbnail](https://user-images.githubusercontent.com/8989346/154557488-2185e055-6dc0-4bed-81d1-7b4fca676db5.png)

# Ceep 

App que permite criar, alterar, remover e visualizar notas em uma lista no formato de grid.

## 🔨 Funcionalidades do projeto

O Ceep permite criar notas com título, descrição e imagem. Também, todas as alterações realizadas, são armazenadas em uma Web API dedicada que pode ser utilizada a [partir deste projeto](https://github.com/alura-cursos/ceep-web-api). 

Além de realizar a integração com a Web API, o App também realiza um mecanismo de sincronização, permitindo que as pessoas alterem as notas sem acesso a internet, e então, após obter acesso a rede, é possível reenviar todas as alterações, seja inserção, alteração ou remoção de notas.

![projeto-inicial-ceep](https://user-images.githubusercontent.com/8989346/149510885-e5a35c6f-1499-4688-a815-bfd90b268a4b.gif)

## ✔️ Técnicas e tecnologias utilizadas

As técnicas e tecnologias utilizadas no projeto foram:

- `Room`: armazenar os dados em banco de dados
- `RecyclerView`: listagem das notas em grid
- `ConstraintLayout`: ViewGroup para implementar layouts
- `Retrofit`: cliente HTTP para realizar requisições Web via HTTP
- `Coroutines`: realizar operações assíncronas, como acesso ao banco de dados ou comunicação HTTP
- `Repositórios`: manter todos os códigos que acessa a fonte de dados
- `UUID`: gerar ids "únicos" e descentralizados
- `flags`: sinalizações para identificar estados de objetos, como ativos/desativados.
- `Migrations`: modificar a estrutura atual do banco de dados para atender novas necessidades
- `Coil`: carregar imagens a partir de URLs
- `View Binding`: buscar views do layout de forma segura

## 📁 Acesso ao projeto

Você pode acessar o código [fonte do projeto inicial](https://github.com/alura-cursos/android-com-kotlin-comunicacao-web/tree/projeto-inicial) ou [baixá-lo](https://github.com/alura-cursos/android-com-kotlin-comunicacao-web/archive/refs/heads/projeto-inicial.zip). 


## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

- **Open an Existing Project** (ou alguma opção similar)
- Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
- Por fim clique em OK

O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆 

## 📚 Mais informações do curso

Gostou do projeto e quer conhecer mais? Você pode [acessar o curso](https://cursos.alura.com.br/course/android-kotlin-comunicacao-web-api) que desenvolve o projeto desde o começo!
