/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMatchBackfillResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket
     * status, and match results as generated during the matchmaking process.
     * </p>
     */
    private MatchmakingTicket matchmakingTicket;

    /**
     * <p>
     * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket
     * status, and match results as generated during the matchmaking process.
     * </p>
     * 
     * @param matchmakingTicket
     *        Ticket representing the backfill matchmaking request. This object includes the information in the request,
     *        ticket status, and match results as generated during the matchmaking process.
     */

    public void setMatchmakingTicket(MatchmakingTicket matchmakingTicket) {
        this.matchmakingTicket = matchmakingTicket;
    }

    /**
     * <p>
     * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket
     * status, and match results as generated during the matchmaking process.
     * </p>
     * 
     * @return Ticket representing the backfill matchmaking request. This object includes the information in the
     *         request, ticket status, and match results as generated during the matchmaking process.
     */

    public MatchmakingTicket getMatchmakingTicket() {
        return this.matchmakingTicket;
    }

    /**
     * <p>
     * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket
     * status, and match results as generated during the matchmaking process.
     * </p>
     * 
     * @param matchmakingTicket
     *        Ticket representing the backfill matchmaking request. This object includes the information in the request,
     *        ticket status, and match results as generated during the matchmaking process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillResult withMatchmakingTicket(MatchmakingTicket matchmakingTicket) {
        setMatchmakingTicket(matchmakingTicket);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMatchmakingTicket() != null)
            sb.append("MatchmakingTicket: ").append(getMatchmakingTicket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMatchBackfillResult == false)
            return false;
        StartMatchBackfillResult other = (StartMatchBackfillResult) obj;
        if (other.getMatchmakingTicket() == null ^ this.getMatchmakingTicket() == null)
            return false;
        if (other.getMatchmakingTicket() != null && other.getMatchmakingTicket().equals(this.getMatchmakingTicket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchmakingTicket() == null) ? 0 : getMatchmakingTicket().hashCode());
        return hashCode;
    }

    @Override
    public StartMatchBackfillResult clone() {
        try {
            return (StartMatchBackfillResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
