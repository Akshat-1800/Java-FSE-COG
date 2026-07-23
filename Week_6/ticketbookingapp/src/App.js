import {useState} from "react";

import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App(){

    const [isLoggedIn,setIsLoggedIn] = useState(false);

    function handleLogin(){

        setIsLoggedIn(true);

    }

    function handleLogout(){

        setIsLoggedIn(false);

    }

    let button;

    if(isLoggedIn){

        button =

            <LogoutButton
                onClick={handleLogout}
            />;

    }
    else{

        button =

            <LoginButton
                onClick={handleLogin}
            />;

    }

    return(

        <div style={{marginLeft:"180px",marginTop:"80px"}}>

            <Greeting

                isLoggedIn={isLoggedIn}

            />

            {button}

        </div>

    );

}

export default App;