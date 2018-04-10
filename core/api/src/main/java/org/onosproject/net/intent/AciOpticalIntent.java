package org.onosproject.net.intent;

import com.google.common.base.MoreObjects;
import org.onosproject.core.ApplicationId;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.flow.TrafficSelector;
import org.onosproject.net.flow.TrafficTreatment;

import java.util.Collections;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by michele on 28/07/16.
 */
public class AciOpticalIntent extends ConnectivityIntent {

    private final ConnectPoint ingressPoint;
    private final ConnectPoint egressPoint;

    public static AciOpticalIntent.Builder builder() {
        return new Builder();
    }

    /**
     * Builder of a Aci Optical Intent.
     */
    public static final class Builder extends ConnectivityIntent.Builder {
        ConnectPoint ingressPoint;
        ConnectPoint egressPoint;

        private Builder() {
            // Hide constructor
        }

        @Override
        public AciOpticalIntent.Builder appId(ApplicationId appId) {
            return (AciOpticalIntent.Builder) super.appId(appId);
        }

        @Override
        public AciOpticalIntent.Builder key(Key key) {
            return (AciOpticalIntent.Builder) super.key(key);
        }

        @Override
        public AciOpticalIntent.Builder selector(TrafficSelector selector) {
            return (AciOpticalIntent.Builder) super.selector(selector);
        }

        @Override
        public AciOpticalIntent.Builder treatment(TrafficTreatment treatment) {
            return (AciOpticalIntent.Builder) super.treatment(treatment);
        }

        @Override
        public AciOpticalIntent.Builder constraints(List<Constraint> constraints) {
            return (AciOpticalIntent.Builder) super.constraints(constraints);
        }

        @Override
        public AciOpticalIntent.Builder priority(int priority) {
            return (AciOpticalIntent.Builder) super.priority(priority);
        }

        /**
         * Sets the ingress point of the Aci Optical intent that will be built.
         *
         * @param ingressPoint ingress connect point
         * @return this builder
         */
        public AciOpticalIntent.Builder ingressPoint(ConnectPoint ingressPoint) {
            this.ingressPoint = ingressPoint;
            return this;
        }

        /**
         * Sets the egress point of the Aci Optical intent that will be built.
         *
         * @param egressPoint egress connect point
         * @return this builder
         */
        public AciOpticalIntent.Builder egressPoint(ConnectPoint egressPoint) {
            this.egressPoint = egressPoint;
            return this;
        }

        /**
         * Builds a Aci Optical intent from the accumulated parameters.
         *
         * @return Aci Optical intent
         */
        public AciOpticalIntent build() {

            return new AciOpticalIntent(
                    appId,
                    key,
                    selector,
                    treatment,
                    ingressPoint,
                    egressPoint,
                    constraints,
                    priority
            );
        }
    }



    /**
     * Creates a new Aci Optical intent with the supplied ingress/egress
     * ports and constraints.
     *
     * @param appId        application identifier
     * @param key          key of the intent
     * @param selector     traffic selector
     * @param treatment    treatment
     * @param ingressPoint ingress port
     * @param egressPoint  egress port
     * @param constraints  optional list of constraints
     * @param priority     priority to use for flows generated by this intent
     * @throws NullPointerException if {@code ingressPoint} or
     *        {@code egressPoints} or {@code appId} is null.
     */
    private AciOpticalIntent(ApplicationId appId,
                               Key key,
                               TrafficSelector selector,
                               TrafficTreatment treatment,
                               ConnectPoint ingressPoint,
                               ConnectPoint egressPoint,
                               List<Constraint> constraints,
                               int priority) {
        super(appId, key, Collections.emptyList(), selector, treatment, constraints,
              priority);

        checkArgument(!ingressPoint.equals(egressPoint),
                      "ingress and egress should be different (ingress: %s, egress: %s)", ingressPoint, egressPoint);

        this.ingressPoint = checkNotNull(ingressPoint);
        this.egressPoint = checkNotNull(egressPoint);
    }

    /**
     * Constructor for serializer.
     */
    protected AciOpticalIntent() {
        super();
        this.ingressPoint = null;
        this.egressPoint = null;
    }

    /**
     * Returns the port on which the ingress traffic should be connected to
     * the egress.
     *
     * @return ingress port
     */
    public ConnectPoint ingressPoint() {
        return ingressPoint;
    }

    /**
     * Returns the port on which the traffic should egress.
     *
     * @return egress port
     */
    public ConnectPoint egressPoint() {
        return egressPoint;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
                .add("id", id())
                .add("key", key())
                .add("appId", appId())
                .add("priority", priority())
                .add("resources", resources())
                .add("selector", selector())
                .add("treatment", treatment())
                .add("ingress", ingressPoint)
                .add("egress", egressPoint)
                .add("constraints", constraints())
                .toString();
    }

}
