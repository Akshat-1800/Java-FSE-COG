export default function ListofIndianPlayers(props){

    return(

        props.IndianPlayers.map((item,index)=>{

            return(

                <div key={index}>

                    <li>

                        Mr. {item}

                    </li>

                </div>

            )

        })

    )

}