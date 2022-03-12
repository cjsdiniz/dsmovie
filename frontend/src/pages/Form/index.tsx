import FormCard from 'components/FormCard';
import { useParams } from 'react-router-dom';

function Form( ) {

    const parms = useParams();

    return (
        <FormCard movieId={`${parms.movieId}`}/>
    )
}

export default Form;