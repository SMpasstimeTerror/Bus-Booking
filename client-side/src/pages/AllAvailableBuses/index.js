
import React, { useState } from 'react'


import { Link, Router, useNavigate } from 'react-router-dom'

import { useLocation } from 'react-router-dom';
import HorizontalSlider from '../../comps/HorizontalSlider'


const AllAvailableBuses = () => {
  const location = useLocation();
  console.log('location=>', location)

  const [bus] = useState(location?.state?.result || [])

  const Navigate = useNavigate();

  // const SeatBook = () => {

    

    

  //   Navigate('/Seat')
  // }

  
  
  

  return (
    <div>
     
      
    
      <HorizontalSlider
        onItemSelect={() => {}}
        
       items={bus}
       
        title="Available Bus"
        
      />


      
     
        
      </div>
       

   
  )
}



export default AllAvailableBuses