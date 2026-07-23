export default function Scorebelow70(props){

    let players70=[];

    props.players.map((item)=>{

        if(item.score<=70){

            players70.push(item);

        }

        return null;

    });

    return(

        players70.map((item)=>{

            return(

                <div key={item.name}>

                    <li>

                        Mr. {item.name}

                        <span> {item.score}</span>

                    </li>

                </div>

            )

        })

    )

}