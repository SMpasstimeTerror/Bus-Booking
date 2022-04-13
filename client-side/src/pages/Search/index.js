import { useState } from 'react'
import { Nav, Navbar, NavDropdown } from 'react-bootstrap'

import './search.css'
import { toast } from 'react-toastify'
import axios from 'axios'
import { Link, Router, useNavigate } from 'react-router-dom'


const Search = () => {

    const { id, firstname, lastName } = sessionStorage

    const [date, setDate] = useState('');
    const [source, setSource] = useState('');
    const [destination, setDestination] = useState('');


    const navigate = useNavigate()


    // const logoutUser = () => {
    //     //remove the logged users details from the session storage
    //     sessionStorage.removeItem('id')
    //     sessionStorage.removeItem('firstName')
    //     sessionStorage.removeItem('lastName')
    //     sessionStorage.removeItem('loginStatus')

    //     navigate('/Signin')
    // }





    const SearchBus = () => {
        if (source.length === 0) {
            toast.warning('please Enter the source')
        } else if (destination.length === 0) {
            toast.warning('please enter the destination')
        } else if (date.length === 0) {
            toast.warning('please enter the date')
        } else {
            const body = {
                date,
                source,
                destination,
            }

            const url = `http://localhost:8080/bus/search`

            //post method of signup API
            axios.post(url, body).then(response => {
                const result = response.data;
                console.log(result)
                if (result['status'] == 'success') {
                    toast.success('Search success')
                    //navigate to the signin page
                    
                    const modifiedData = result.data.map((bus) => {
                        return {
                            ...bus,
                            title: `${bus.busNo} ${bus.source} ${bus.destination} ${bus.time}
                                     ${bus.date} ${bus.amount} `,
                          
                        }
                    })

                   
                    
                    navigate('/allavailablebuses', { state: { result: modifiedData } })
 

                } else {
                    toast.error(result['error'])
                }

            })
        }
    }

    return (
        

        <div className="background">
            
            <div className="set"> welcome { firstname } </div>

                <Navbar bg="" variant="dark" >
               <NavDropdown className="lgout"  title={firstname}>
                
                      
                <NavDropdown.Item href="/Signin">Logout</NavDropdown.Item>
                {/* <NavDropdown.Item href="/MyReservation">My Bookings</NavDropdown.Item> */}
               
               
               </NavDropdown>
               
              <Nav >
               {/* <div className="ct"><Nav.Link href="/Cancel">Cancel Ticket</Nav.Link></div> */}
                 
                 
                  
                 
                  
               </Nav> 
              
              </Navbar> 
             
            {/* <div className="p">

                

            <div className="fnm">  </div>
                <h1>Search Buses Here</h1></div> */}
               
               

                
            <div className="form">
                
                <div className="row">
                    <div className="col"></div>
                    <div className="col">
                    <h1>Search Buses Here</h1>
                    
                        <div >

                            <label htmlFor="" className="label-control" >
                                Source
                            </label>
                            <input onChange={(e) => {

                                setSource(e.target.value)
                            }} type="text" placeholder="Source" className="form-control" />
                        </div>



                        <div>

                            <label htmlFor="" className="label-control" >
                                destination
                            </label>
                            <input onChange={(e) => {

                                setDestination(e.target.value)
                            }} type="text" placeholder="Destination" className="form-control" />
                        </div>

                        <div>

                            <label htmlFor="" className="label-control" >
                                date
                            </label>
                            <input onChange={(e) => {

                                setDate(e.target.value)
                            }} type="date" placeholder="date" className="form-control" />
                        </div>
                        <div className="sear">
                            <button onClick={SearchBus} className="btn btn-info">Search Bus</button>
                        </div>


                    </div>
                    <div className="col"></div>
                   
                </div>
            </div>
        
        </div>


    )
}
export default Search
