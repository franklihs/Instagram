package br.dev.franklin.instagram.data.repository

import br.dev.franklin.instagram.data.model.Feed
import br.dev.franklin.instagram.data.model.Story
import br.dev.franklin.instagram.data.model.User

val storiesList = listOf(
  Story(
    userNickName = "anabanana",
    userAvatar = "https://images.pexels.com/photos/27064278/pexels-photo-27064278/free-photo-of-mar-praia-litoral-areia.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
  ), Story(
    userNickName = "monkeyman",
    userAvatar = "https://images.pexels.com/photos/15030608/pexels-photo-15030608/free-photo-of-animal-bicho-retrato-macaco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "kitty",
    userAvatar = "https://images.pexels.com/photos/15442329/pexels-photo-15442329/free-photo-of-animal-animal-de-estimacao-pet-sentado.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "coralina",
    userAvatar = "https://images.pexels.com/photos/28209510/pexels-photo-28209510/free-photo-of-moda-tendencia-pessoas-mulher.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "cowboy",
    userAvatar = "https://images.pexels.com/photos/26976780/pexels-photo-26976780/free-photo-of-homem-seco-jaqueta-casaco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "photobooth",
    userAvatar = "https://images.pexels.com/photos/18111515/pexels-photo-18111515/free-photo-of-mulher-camera-maquina-parede.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "ourcouple",
    userAvatar = "https://images.pexels.com/photos/27583533/pexels-photo-27583533/free-photo-of-preto-e-branco-p-b-casal-conjuges.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "lovephotography",
    userAvatar = "https://images.pexels.com/photos/28129767/pexels-photo-28129767/free-photo-of-panorama-vista-paisagem-natureza.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "citylife",
    userAvatar = "https://images.pexels.com/photos/27989044/pexels-photo-27989044/free-photo-of-cidade-meio-urbano-trafego-transito.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "surfinglife",
    userAvatar = "https://images.pexels.com/photos/28177560/pexels-photo-28177560/free-photo-of-leve-luz-light-preto-e-branco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  ), Story(
    userNickName = "naturepictures",
    userAvatar = "https://images.pexels.com/photos/27964937/pexels-photo-27964937/free-photo-of-leve-luz-light-alvorecer.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load"
  )
)

val feedList = listOf(
  Feed(
    userNickName = "anabanana",
    userAvatar = "https://images.pexels.com/photos/27064278/pexels-photo-27064278/free-photo-of-mar-praia-litoral-areia.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
    localName = "Beach",
    imageUrl = "https://images.pexels.com/photos/11155263/pexels-photo-11155263.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    postedAgo = "21 hours ago"
  ), Feed(
    userNickName = "coralina",
    userAvatar = "https://images.pexels.com/photos/28209510/pexels-photo-28209510/free-photo-of-moda-tendencia-pessoas-mulher.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "Forest",
    imageUrl = "https://images.pexels.com/photos/18981044/pexels-photo-18981044/free-photo-of-panorama-vista-paisagem-natureza.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
    postedAgo = "2 days ago"
  ), Feed(
    userNickName = "kitty",
    userAvatar = "https://images.pexels.com/photos/15442329/pexels-photo-15442329/free-photo-of-animal-animal-de-estimacao-pet-sentado.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "Rock Mountain",
    imageUrl = "https://images.pexels.com/photos/18870112/pexels-photo-18870112/free-photo-of-explorando-o-lago-mc-arthur-de-yoho.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "ah! those snowy mountains",
    postedAgo = "4 days ago"
  ), Feed(
    userNickName = "cowboy",
    userAvatar = "https://images.pexels.com/photos/26976780/pexels-photo-26976780/free-photo-of-homem-seco-jaqueta-casaco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "Old arrowhead trail",
    imageUrl = "https://images.pexels.com/photos/27367125/pexels-photo-27367125/free-photo-of-preto-e-branco-p-b-veado-animais-selvagens.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "Oh deer",
    postedAgo = "10 hours ago"
  ), Feed(
    userNickName = "monkeyman",
    userAvatar = "https://images.pexels.com/photos/15030608/pexels-photo-15030608/free-photo-of-animal-bicho-retrato-macaco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "Green forest",
    imageUrl = "https://videos.pexels.com/video-files/10058358/10058358-sd_360_640_30fps.mp4",
    description = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
    postedAgo = "Há 22 horas"
  ), Feed(
    userNickName = "lovephotography",
    userAvatar = "https://images.pexels.com/photos/28129767/pexels-photo-28129767/free-photo-of-panorama-vista-paisagem-natureza.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "Sunflower crops",
    imageUrl = "https://videos.pexels.com/video-files/26224650/11940583_360_640_25fps.mp4",
    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.",
    postedAgo = "21 hours ago"
  ), Feed(
    userNickName = "surfinglife",
    userAvatar = "https://images.pexels.com/photos/28177560/pexels-photo-28177560/free-photo-of-leve-luz-light-preto-e-branco.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "somewhere out there",
    imageUrl = "https://images.pexels.com/photos/28133538/pexels-photo-28133538/free-photo-of-pier-quebra-mar-preto-e-branco-p-b.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur?",
    postedAgo = "Há 21 horas"
  ), Feed(
    userNickName = "ourcouple",
    userAvatar = "https://images.pexels.com/photos/27583533/pexels-photo-27583533/free-photo-of-preto-e-branco-p-b-casal-conjuges.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    localName = "By the city",
    imageUrl = "https://images.pexels.com/photos/27703479/pexels-photo-27703479/free-photo-of-ceu-por-do-sol-feriado-ponto-de-referencia.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",
    description = "Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?",
    postedAgo = "5 days ago"
  )
)

val defaultUser = User(
  userId = "123abc456def",
  name = "Default User",
  avatarUrl = null,
  age = 31,
  score = 900,
  registerDate = "01/01/2001",
  email = "default@user.com",
  bio = "Just a guy like everyone else",
)