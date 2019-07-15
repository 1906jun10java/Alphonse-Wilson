
let book1  = { title: "In Search of Lost Time" , author: "Marcel Proust" , genre: "	Modernist"};
let book2  = { title: "Ulysses" , author: "James Joyce" , genre: "Modernist"};
let book3  = { title: "Catch-22" , author: "Joseph Heller" , genre: "Dark comedy"};
let text = "";
var myArray    = new Array();
    myArray[0] = book1;
    myArray[1] = book2;
    myArray[2] = book3;
  

    var mylist= "<ul>";
 
  for (var i=0; i<myArray.length; i++) {
    mylist+="<li> Title: "+myArray[i].title+" Author: "+myArray[i].author+" Genre: "+myArray[i].genre+"  <button onclick=\"selection()\">edit</button>   </li>";
   
  }  
   mylist+="</ul><br>";

 document.write( mylist, text);