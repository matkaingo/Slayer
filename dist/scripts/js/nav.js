
var splash, menu, level_1, creditos;
var btn_volver, btn_level_1, btn_creditos; 
var secciones;

window.onload = ()=>{
  
  crearReferencias();
  setTimeout(irMenu,1500);
  agregarEventos();
  initLocal();
  
}
function crearReferencias(){ //Saco el id de la seccion y del boton
  
  splash = document.getElementById("splash");
  menu = document.getElementById("menu");
  //home
  creditos = document.getElementById("creditos");
  level_1 = document.getElementById("level_1");
  

  secciones = [splash, menu, level_1, creditos];

  btns_volver = document.querySelectorAll(".volver"); //Volver al home
  btn_level_1 = document.getElementById("btn_play");
  btn_creditos = document.getElementById("btn_creditos"); 

}
function agregarEventos() //Redireccion el destino al dar clic al boton
{
  btn_level_1.addEventListener("click",irLevel);
  btn_creditos.addEventListener("click", irCreditos);
  for(var i=0;i<=4;i++)
  {
      btns_volver[i].addEventListener("click",irMenu);
  }

}
function ocultarSecciones(){
  for(i in secciones)
  {
    secciones[i].classList.add("ocultar");  
  }
}

function irA(seccion){
  ocultarSecciones();
  seccion.classList.remove("ocultar");
}

function irMenu(){
  ocultarSecciones();
  menu.classList.remove("ocultar");
}

function irLevel(event){
    ocultarSecciones();
    level_1.classList.remove("ocultar");
  }
function irCreditos(event){
  ocultarSecciones();
  creditos.classList.remove("ocultar");
}

