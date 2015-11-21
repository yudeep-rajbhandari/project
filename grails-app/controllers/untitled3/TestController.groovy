package untitled3

class TestController {

    def index() {
    def test=new Test();
        test.name="sandeep";
        test.address="ktm";
        test.save(flush: true)

    }

    def getData(){
         List test=Test.getAll();
        test.each {
            render "name${it.name}address${it.address}"
        }

    }
}
