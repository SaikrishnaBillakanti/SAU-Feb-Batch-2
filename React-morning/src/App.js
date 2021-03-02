import React,{Component} from 'react';
import './App.css';
import  Navbar  from "./Components/layout/Navbar";
import Bookitems from "./Components/books/Bookitems";

class App extends Component 
{
   render()
  {  
    return (
      <div className="App">     
        <Navbar title="My Book Store"/> 
        <div className="container">
        <Bookitems/>
        </div>
        
      </div>
    );
  }
  
}

export default App;
