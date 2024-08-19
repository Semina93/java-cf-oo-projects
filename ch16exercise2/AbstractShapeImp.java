package gr.aueb.cf.ch16.ch16exercise2;

public abstract class AbstractShapeImp implements IShape {
    protected long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

