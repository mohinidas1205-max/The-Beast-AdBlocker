package main
import (
	"fmt"
	"net/http"
)

func main() {
	http.HandleFunc("/stats", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, `{"ads": 1346, "data": "450MB"}`)
	})
	fmt.Println("🚀 Beast Server Running on Port 8080...")
	http.ListenAndServe(":8080", nil)
}
