import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

    const [count, setCount] = useState(0);

    function incrementValue() {

        setCount(count + 1);

    }

    function decrementValue() {

        setCount(count - 1);

    }

    function sayHello() {

        alert("Hello! Member!");

    }

    function increment() {

        incrementValue();

        sayHello();

    }

    function welcome(message) {

        alert(message);

    }

    function syntheticEvent() {

        alert("I was clicked");

    }

    return (

        <div>

            <h3>{count}</h3>

            <button onClick={increment}>

                Increment

            </button>

            <br />

            <button onClick={decrementValue}>

                Decrement

            </button>

            <br />

            <button onClick={() => welcome("welcome")}>

                Say welcome

            </button>

            <br />

            <button onClick={syntheticEvent}>

                Click on me

            </button>

            <br /><br />

            <CurrencyConvertor />

        </div>

    );

}

export default App;