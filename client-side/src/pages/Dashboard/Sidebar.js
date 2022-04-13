import React from 'react'
import './side.css'
import profile from "../../images/b.png"

import { SidebarData } from './SidebarData'

function Sidebar() {
    return (
      
      <div className="back">
        
    <div className="Sidebar">
        <ul className="SidebarList">
        <div className="container-image">
         <img src={profile} alt="profile" width="80" height="80"/><h1>Welcome</h1>
             
         </div>
         {SidebarData.map((val,key) => {
           return <li key={key} className="row" onClick={() =>{
               window.location.pathname = val.link}}> 
            {""}
           <div id="icon">{val.icon}</div>{""}
           <div id="title">
                {val.title}
           </div>
           </li>

    })}
    </ul>
    </div>
    </div>
  );
}
export default Sidebar
