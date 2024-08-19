package gr.aueb.cf.ch16.ch16exercise1;


public abstract class AbstractShapeImpl implements IShape {
    protected long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
