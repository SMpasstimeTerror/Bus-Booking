
import Signin from './pages/Signin'
import Signup from './pages/Signup'
import Home from './pages/LandingPage'
import Search from './pages/Search'
import Sidebar from './pages/Dashboard/Sidebar'
import Seat from './pages/Booking/Seat'
import HomePage from './pages/Homepage'
import TicketData from './pages/TicketData'
import Payment from './pages/Payment'
import Print from './pages/Print'
import Cancel from './pages/Cancel'
import Contact from './pages/Contact/Contact'

import AllAvailableBuses from './pages/AllAvailableBuses'





import {BrowserRouter, Route, Routes, Link, Router } from 'react-router-dom'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'





const AuthorizeUser = () => {
  const loginStatus = sessionStorage['loginStatus']
  return loginStatus=='1' ? <Signin/> : <Home/>
  // if(loginStatus=='1'){
  //   return <home/>
  // }else{
  //   return <Signin/>
  // }
}
function App() {
  return (
    <div className="container"> {/*container brings everything in the middle */}
       
      
      
      <BrowserRouter>
         <Routes>
         <Route path="/" element={<AuthorizeUser/>}></Route>
            <Route path="/Signin" element={<Signin />}></Route>
            <Route path="/Signup" element={<Signup />}></Route>
            <Route path="/Home" element={<Home />}></Route>
            <Route path="/Search" element={<Search/>}></Route>
            <Route path="/allavailablebuses" element={<AllAvailableBuses />}></Route>
            <Route path="/Sidebar" element={<Sidebar/>}></Route>
            <Route path="/Seat" element={<Seat/>}></Route>
            <Route path="/HomePage" element={<HomePage />}></Route>
            <Route path="/TicketData" element={<TicketData />}></Route>
            <Route path="/Payment" element={<Payment />}></Route>
            <Route path="/Print" element={<Print />}></Route>
            <Route path="/Cancel" element={<Cancel />}></Route>
            <Route path="/Contact" element={<Contact/>}></Route>
           

         </Routes>
      
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
    
  );
}

export default App;









