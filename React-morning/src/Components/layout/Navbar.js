import React, { Component } from 'react'

export default class Navbar extends Component {
    render() 
    {
    
        return (
            <div>
                <nav className="navbar bg-primary">Welcome to {this.props.title}</nav>
            </div>
        )
    }
}
