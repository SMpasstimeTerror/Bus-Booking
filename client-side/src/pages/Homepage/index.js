import React from "react"
import { Link } from "react-router-dom"
import './page.css'
import { Nav, Navbar, NavDropdown } from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.css'
import * as FaIcons from 'react-icons/fa'
import { NavLink } from 'react-router-dom'

import { FcHome, FcPhone } from 'react-icons/fc'
import { CgProfile,IoMdLogOut } from 'react-icons/cg'
import { IoTicketOutline } from 'react-icons/io5'
import { BsPower } from 'react-icons/bs'
import { FcSearch } from "react-icons/fc";
import { useNavigate } from "react-router"



const HomePage = () => {

   
    

    return (
       
        <div className="head">
            
         
         
        <div className="nav">
        
            <Navbar bg="dark"   variant="dark" >
            
            <div className="design" >
           
              <Navbar.Toggle />

              <Navbar.Collapse>
             
              <h2>Bus Ticket Booking System</h2>
              <Nav className="page">
                  
               
                {/* <FcHome/ > */}
                 <NavDropdown title="Home">
                
                       <NavDropdown.Item href="Signin">Signin</NavDropdown.Item>
                       <NavDropdown.Item href="Signup">Signup</NavDropdown.Item>
                       {/* <NavDropdown.Item href="/Signin">Logout</NavDropdown.Item> */}
                      
                </NavDropdown>
                {/* <FcPhone /> */}
                   <Nav.Link href="Contact">Contact</Nav.Link>
                   {/* <CgProfile/> */}
                   <Nav.Link href="About">About</Nav.Link>
                   
                 
                  
                   
                   
                  
                 
               </Nav>
              </Navbar.Collapse>
            
                
                
            
              
               
               </div>
            </Navbar>
            </div>
        </div>
        
      
    )
 
}
export default HomePage