# ProjetoFaculdade MINI BLOG COM CRUD

# Apresentação do Projeto
O projeto consiste na criação de uma aplicação web, um mini blog, com operações básicas de CRUD (Create, Read, Update, Delete) para as entidades Post, User, Comment e Tag. Utilizando Spring Boot, com os módulos Spring MVC, Spring Data JPA, Spring Security, usando o padrão de design Model-View-Controller (MVC), a persistência de dados com Hibernate e a implementação de segurança com autenticação e autorização! 

# Detalhes da aplicação: 
O mini blog, permitirá a criação de usuários autenticados, postagens, comentários e a utilização de tags como hashtags para filtragem. As quatro entidades principais do projeto são: Post, User, Comment e Tag. Essas entidades serão modeladas em um diagrama de entidade-relacionamento, teremos as tabelas Tag, Post, User e Comment. Cada tabela terá um ID único, incrementado automaticamente pelo JPA. A tabela Tag conterá o ID e o nome da tag. A tabela Post conterá o ID, título, conteúdo, data da postagem e uma chave estrangeira para identificar o usuário que fez a postagem. A tabela User terá o ID, nome, e-mail, senha e role (papel), indicando se o usuário é administrador ou não. A tabela Comment terá o ID, conteúdo, data, a identificação da postagem e do usuário que fez o comentário. 

# Objetivo: 
A estrutura permitirá a criação de postagens com múltiplos comentários, usuários que podem criar várias postagens e comentários, e a utilização de tags em múltiplas postagens. 

**O projeto será detalhado e atualizado conforme necessário durante a implementação.**
