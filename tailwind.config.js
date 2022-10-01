module.exports = {
  content: process.env.NODE_ENV == 'production' ?
    ["./resources/public/assets/js/main.js"] :
    ["./resources/public/assets/js/cljs-runtime/*.js"],
  theme: {
    extend: {}
  },
  plugins: []
}
