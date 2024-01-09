import React, {Component} from 'react';
 import Form from "./Form";
import {connect} from "react-redux";
import "../screen/index.css";


class StartPage extends Component{

    render() {
        return (
            <div >
                <div id="header" className="logo">
                    <div className="left-right-line-short-header">Смирнов Игорь && Коваленко Илья P3223</div>
                </div>
                <Form/>
            </div>
        );
    }
}

const stateToProps = store => {
    return {
        user: store.user,
        app: store.app
    }
};

export default (connect(stateToProps)(StartPage));
