import React, { Component } from 'react'
import Bookitem from './Bookitem'

export class Bookitems extends Component 
{
    state={
        Bookitems :[
        {
        id:'2',
        bookname:'firstbook',
        bookurl:'http://books.google.com/books/content?id=UpNHAQAAMAAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api',
        bookdetails:'https://play.google.com/store/books/details?id=UpNHAQAAMAAJ&source=gbs_api'
        },
        {
         id:'3',
         bookname:'Secondbook',
         bookurl:'http://books.google.com/books/content?id=I_qvDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api',
         bookdetails:'https://play.google.com/store/books/details?id=I_qvDwAAQBAJ&source=gbs_api'
        },
        {
        id:'4',
        bookname:'thirdbook',
        bookurl:'http://books.google.com/books/content?id=UjG8qXVRSSQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api',
        bookdetails:'http://books.google.co.in/books?id=UjG8qXVRSSQC&dq=search+terms&hl=&source=gbs_api'
         }
    ]}

    render()
     {
        return (
            <div style={userstyle}>
                {this.state.Bookitems.map(bookitem =>( 
                <Bookitem bookitem={bookitem}/>))
                }
            </div>
        );
    }

}
const userstyle={
    display:'grid',
    gridTemplateColumns:'repeat(3,1fr)',
    gridGap:'2rem'
}

export default Bookitems;
