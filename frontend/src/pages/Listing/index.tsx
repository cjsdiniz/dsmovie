import MovieStars from "components/MovieStars";
import Pagination from "components/Pagination";

function Listing() {
    return (
        // <h1>Listagem</h1>
        <>
            <Pagination />
            <MovieStars />
        </>
    )
}

export default Listing;