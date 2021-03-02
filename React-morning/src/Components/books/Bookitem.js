import React from 'react'


const Bookitem=(props)=>
    {   
         const {bookname,bookurl,bookdetails}=props.bookitem;
        return (
            <div className='all-center'>
                <img src={bookurl} alt='' class="card"style= {{width:'60 px',textAlign:"center"}}/>
                <h3 class="p-1">{bookname}</h3>
                <div>
                    <a href={bookdetails} className='btn btn-dark btn-sm my-1'>click to get details </a>
                </div>
            </div>
        )
    
}

export default Bookitem;
